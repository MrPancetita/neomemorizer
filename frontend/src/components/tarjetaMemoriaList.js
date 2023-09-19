import React from "react";

const path = "/images/"; 

const TarjetaMemoria = ({tarjeta}) => {
    return (
        <div>
            <div className="col-1">
                {tarjeta.id}
            </div>
            <div className="col-2">
                {tarjeta.numero}
            </div>
            <div className="col-3">
                {tarjeta.palabra}
            </div>
            <div className="col-6">
                <img src={path + tarjeta.imagen} alt="Imagen" /> 
            </div>
        </div>
    );  

}

export default TarjetaMemoria;
