import React from "react";
import "./App.css";
import officeImage from "./office.jpg";

function App() {
  const heading = "Office Space Rental App";

  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai"
  };

  const officeSpaces = [
    {
      id: 1,
      name: "DBS",
      rent: 50000,
      address: "Chennai"
    },
    {
      id: 2,
      name: "Regus",
      rent: 75000,
      address: "Bangalore"
    },
    {
      id: 3,
      name: "WeWork",
      rent: 60000,
      address: "Hyderabad"
    },
    {
      id: 4,
      name: "Innov8",
      rent: 45000,
      address: "Delhi"
    }
  ];

  const getRentColor = (rent) => {
    return rent < 60000 ? "red" : "green";
  };

  return (
    <div className="app">
      <h1>{heading}</h1>

      <img
        src={officeImage}
        alt="Office Space"
        className="office-image"
      />

      <h2>Office Details</h2>

      <h3>Name: {office.name}</h3>

      <h3
        style={{
          color: getRentColor(office.rent)
        }}
      >
        Rent: Rs. {office.rent}
      </h3>

      <h3>Address: {office.address}</h3>

      <hr />

      <h2>Available Office Spaces</h2>

      <div className="office-container">
        {officeSpaces.map((item) => (
          <div className="office-card" key={item.id}>
            <h2>Name: {item.name}</h2>

            <h3
              style={{
                color: getRentColor(item.rent)
              }}
            >
              Rent: Rs. {item.rent}
            </h3>

            <h3>Address: {item.address}</h3>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;