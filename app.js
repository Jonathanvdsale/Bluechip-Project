import React from 'react';
import './App.css';

function App() {

  const axios = require('axios');

    // Make a request for a user with a given ID
    axios.get('http://localhost:8080')
      .then(function (response) {
        
        // handle success
        console.log(response.data.name);
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      })
      .then(function () {
        // always executed
      });

  return (
    <div className="App">

    </div>
  );
}

export default App;
