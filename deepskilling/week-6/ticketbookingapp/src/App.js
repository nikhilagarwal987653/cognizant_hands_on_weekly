import React, { Component } from "react";
import Greeting from "./Components/Greeting";
import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  handleLoginClick = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  handleLogoutClick = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {
    const isLoggedIn = this.state.isLoggedIn;
    let button;

    if (isLoggedIn) {
      button = (
        <LogoutButton onClick={this.handleLogoutClick} />
      );
    } else {
      button = (
        <LoginButton onClick={this.handleLoginClick} />
      );
    }

    return (
      <div style={{ margin: "40px" }}>
        <Greeting isLoggedIn={isLoggedIn} />

        <br />

        {button}
      </div>
    );
  }
}

export default App;