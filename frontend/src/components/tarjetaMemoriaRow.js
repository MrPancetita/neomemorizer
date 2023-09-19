import React from "react";

const path = "/images/"; 

const TarjetaMemoria = ({tarjeta}) => {
    return (
        <tr>
            <td className="col-1">
                {tarjeta.id}
            </td>
            <td className="col-2">
                {tarjeta.numero}
            </td>
            <td className="col-3">
                {tarjeta.palabra}
            </td>
            <td className="col-6">
                <img src={path + tarjeta.imagen} alt="Imagen" /> 
            </td>
        </tr>
    );  

}

export default TarjetaMemoria;
