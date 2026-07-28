import React from "react";

function UserPage() {
  return (
    <div>
      <h1>Welcome back</h1>

      <h2>Book Your Ticket</h2>

      <form>
        <label>From: </label>
        <input type="text" placeholder="Enter source city" />

        <br />
        <br />

        <label>To: </label>
        <input type="text" placeholder="Enter destination city" />

        <br />
        <br />

        <label>Date: </label>
        <input type="date" />

        <br />
        <br />

        <button type="button">Book Ticket</button>
      </form>
    </div>
  );
}

export default UserPage;