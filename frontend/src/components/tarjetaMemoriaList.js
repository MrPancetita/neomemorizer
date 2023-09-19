import React, { useEffect, useState } from "react";
import TarjetaMemoriaRow from "./tarjetaMemoriaRow";

const path = "/images/"; 




const TarjetaMemoriaList = () => {

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
        <table className="table table-hover table table-dark">
        <thead>
          <tr>
            <th>Numero</th>
            <th>Palabra</th>
            <th>Imagen</th>
          </tr>
        </thead>
        <tbody>
          {tarjetas.map((t) => (
            <TarjetaMemoriaRow key={t.id} tarjeta={t} />
          ))}
        </tbody>
      </table>
    );  

}

export default TarjetaMemoriaList;
