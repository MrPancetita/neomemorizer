import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.bundle';
import TarjetaMemoria from './components/tarjetaMemoriaList';
import TarjetaMemoriaList from './components/tarjetaMemoriaList';


function App(props) {


  return (
    <div className="App col-12">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <div className="App-intro">
          <h2>Tarjetas Memoria</h2>
          <TarjetaMemoriaList/>
        </div>
      </header>
    </div>
  );
}

export default App;
