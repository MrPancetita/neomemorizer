import React, { useEffect, useState } from "react";
import TarjetaMemoriaRow from "./tarjetaMemoriaRow";
import { Button, Card, CardActions, CardContent, CardMedia, Grid, Typography } from "@mui/material";

const path = "/images/"; 

const TarjetaMemoriaGrid = () => {

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
      <Grid container spacing={4}>
            {tarjetas.map((card) => (
              <Grid item key={card.id} xs={12} sm={6} md={4}>
                <Card
                  sx={{ height: '100%', display: 'flex', flexDirection: 'column' }}
                >
                  <CardMedia
                    component="div"
                    sx={{
                      // 16:9
                      pt: '56.25%',
                    }}
                    image={path + card.imagen}
                  />
                  <CardContent sx={{ flexGrow: 1 }}>
                    <Typography gutterBottom variant="h5" component="h2">
                      {card.numero + " - " + card.palabra}
                    </Typography>
                    <Typography>
                      This is a media card. You can use this section to describe the
                      content.
                    </Typography>
                  </CardContent>
                  <CardActions>
                    <Button size="small">View</Button>
                    <Button size="small">Edit</Button>
                  </CardActions>
                </Card>
              </Grid>
            ))}
          </Grid>

      
  
    );  

}

export default TarjetaMemoriaGrid;
