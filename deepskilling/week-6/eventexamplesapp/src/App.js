import React from "react";
import EventExamples from "./Components/EventExamples";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {
  return (
    <div style={{ margin: "20px" }}>
      <h1>React Event Examples</h1>

      <EventExamples />

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;