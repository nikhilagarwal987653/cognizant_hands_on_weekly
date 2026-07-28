import React from "react";

function GuestPage() {
  return (
    <div>
      <h1>Please sign up.</h1>

      <h2>Flight Details</h2>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI-101</td>
            <td>Delhi</td>
            <td>Mumbai</td>
            <td>₹5,000</td>
          </tr>

          <tr>
            <td>AI-202</td>
            <td>Mumbai</td>
            <td>Bangalore</td>
            <td>₹4,500</td>
          </tr>

          <tr>
            <td>AI-303</td>
            <td>Chennai</td>
            <td>Delhi</td>
            <td>₹6,000</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default GuestPage;