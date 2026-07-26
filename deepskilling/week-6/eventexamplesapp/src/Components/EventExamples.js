import React, { Component } from "react";

class EventExamples extends Component {
  constructor() {
    super();
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  sayHello = () => {
    alert("Hello! Static Message");
  };

  handleIncrease = () => {
    this.increment();
    this.sayHello();
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  handleClick = () => {
    alert("I was clicked");
  };

  render() {
    return (
      <div>
        <h2>Counter : {this.state.count}</h2>

        <button onClick={this.handleIncrease}>Increment</button>

        <button onClick={this.decrement}>Decrement</button>

        <br /><br />

        <button onClick={() => this.sayWelcome("Welcome")}>
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.handleClick}>
          OnPress
        </button>
      </div>
    );
  }
}

export default EventExamples;