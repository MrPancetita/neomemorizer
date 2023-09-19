import React from "react";

const path = "/images/"; 

const TarjetaMemoriaRow = ({tarjeta}) => {
    return (
        <tr>
            <td >
                {tarjeta.numero}
            </td>
            <td >
                {tarjeta.palabra}
            </td>
            <td className="img-thumbnail">
                <img src={path + tarjeta.imagen} alt="Imagen" /> 
            </td>
        </tr>
    );  

}

export default TarjetaMemoriaRow;
