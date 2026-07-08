console.log("Welcome to the Community Portal");
window.onload = () => alert("Page is fully loaded");

const defaultEvent = "Tech Setup";
const defaultDate = "2026-08-01";
let totalSeats = 100;

const eventString = `${defaultEvent} is scheduled for ${defaultDate}`;
totalSeats--;

class Event {
    constructor(name, category, seats) {
        this.name = name;
        this.category = category;
        this.seats = seats;
    }

    checkAvailability() {
        return this.seats > 0;
    }
}

const communityEvents = [];
communityEvents.push(new Event("React Workshop", "Tech", 50));
communityEvents.push(new Event("Local Concert", "Music", 0));
communityEvents.push(new Event("Baking Class", "Food", 20));

const techEvents = communityEvents.filter(e => e.category === "Tech");
const formattedEvents = communityEvents.map(e => `${e.name} (${e.category})`);

const dynamicContainer = document.querySelector("#dynamicEvents");

communityEvents.forEach(evt => {
    if (evt.checkAvailability()) {
        const card = document.createElement("div");
        card.className = "eventCard";
        card.innerHTML = `<h3>${evt.name}</h3><p>Category: ${evt.category}</p><p>Seats: ${evt.seats}</p>`;
        dynamicContainer.appendChild(card);
    }
});

const eventForm = document.querySelector("#eventForm");

eventForm.addEventListener("submit", async (e) => {
    e.preventDefault();
    try {
        const nameInput = document.querySelector("input[name='userName']").value;
        if (!nameInput) throw new Error("Name is required");

        document.querySelector("#formOutput").textContent = "Processing registration...";

        const response = await fetch('https://jsonplaceholder.typicode.com/posts', {
            method: 'POST',
            body: JSON.stringify({ user: nameInput, status: 'registered' }),
            headers: { 'Content-type': 'application/json; charset=UTF-8' }
        });
        
        const data = await response.json();
        document.querySelector("#formOutput").textContent = "Registration Successful!";
        console.log(data);

    } catch (error) {
        document.querySelector("#formOutput").textContent = error.message;
    }
});

const typeSelect = document.querySelector("#eventType");
typeSelect.addEventListener("change", (e) => {
    localStorage.setItem("preferredEvent", e.target.value);
});

if (localStorage.getItem("preferredEvent")) {
    typeSelect.value = localStorage.getItem("preferredEvent");
}

document.querySelector("#clearPrefsBtn").addEventListener("click", () => {
    localStorage.clear();
    sessionStorage.clear();
    alert("Preferences Cleared");
});

document.querySelector("#findNearbyBtn").addEventListener("click", () => {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
            (position) => {
                document.querySelector("#locationDisplay").textContent = 
                    `Latitude: ${position.coords.latitude}, Longitude: ${position.coords.longitude}`;
            },
            (error) => {
                document.querySelector("#locationDisplay").textContent = "Location access denied or timeout.";
            },
            { enableHighAccuracy: true }
        );
    } else {
        document.querySelector("#locationDisplay").textContent = "Geolocation not supported.";
    }
});