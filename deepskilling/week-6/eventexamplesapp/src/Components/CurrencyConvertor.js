import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor() {
    super();

    this.state = {
      rupees: "",
      euro: ""
    };
  }

  handleChange = (event) => {
    this.setState({
      rupees: event.target.value
    });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    const convertedEuro = this.state.rupees / 90;

    this.setState({
      euro: convertedEuro.toFixed(2)
    });
  };

  render() {
    return (
      <div>
        <h1>Currency Convertor</h1>

        <form onSubmit={this.handleSubmit}>
          <label>Amount in Rupees: </label>

          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
          />

          <br />
          <br />

          <button type="submit">Convert</button>
        </form>

        {this.state.euro && (
          <h3>Amount in Euro: {this.state.euro}</h3>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;