import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap.bundle';
import TarjetaMemoria from './components/tarjetaMemoriaList';
import TarjetaMemoriaList from './components/tarjetaMemoriaList';
import CssBaseline from '@mui/material/CssBaseline';
import Album from './components/Album';


function App(props) {


  return (
    <React.Fragment>
      <CssBaseline />
      <div className="App col-12">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-intro">
            <h2>Tarjetas Memoria</h2>
            <Album/>
          </div>
        </header>
      </div>
    </React.Fragment>
  );
}

export default App;
