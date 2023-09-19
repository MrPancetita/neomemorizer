import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.bundle';
import TarjetaMemoria from './components/tarjetaMemoriaList';


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
    <div className="App col-12">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div className="App-intro">
          <h2>Tarjetas Memoria</h2>
          {tarjetas.map((t) => (
            <TarjetaMemoria key={t.id} tarjeta={t}/>  
          ))}
        </div>
      </header>
    </div>
  );
}

export default App;
