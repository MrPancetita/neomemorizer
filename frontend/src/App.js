import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';



function App(props) {
  const [tarjetas, setTarjetas] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const response = await fetch('/estudiador');
      const body = await response.json();
      setTarjetas(body);
    }
    fetchData();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div className="App-intro">
          <h2>Tarjetas Memoria</h2>
          {tarjetas.map(tarjeta =>
            <div key={tarjeta.id}>
              {tarjeta.numero} ({tarjeta.palabra})
            </div>
          )}
        </div>
      </header>
    </div>
  );
}

export default App;
