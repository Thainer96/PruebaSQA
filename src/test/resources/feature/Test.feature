#language: es
Característica: Automatizacion Test

  Antecedentes: 
    Dado un usuario que ingrese a la pagina de despegar

  @Reserva
  Esquema del escenario: Reservar en despegar
    Cuando seleccione el tipo "Alojamiento"
    Y Seleccione de destino "Cucuta " con el mes "Mayo" el dia "11" de llegada y "12" de salida
    Y presione el boton aplicar y luego buscar
    Entonces se muestra la lista de hoteles seleccionando "Hotel Casablanca"
    Y se guarde la informacion en el archivo despues presionando el boton reservar
    Y finalmente se llenan los datos del cliente <Nombre><Apellido><Correo><codPais><Area><NumeroCelular><NumTarjeta><TitularTarjeta><Vencimiento>

    Ejemplos: 
      | Nombre  | Apellido | Correo           | codPais       | Area | NumeroCelular | NumTarjeta          | TitularTarjeta | Vencimiento |
      |" Thainer" | "Perez"   | "thainer@mail.com" | "Colombia (57)" |  "123" |    "3133421083" | "6596841651465161586" | "Thainer Perez"  |"23/10"       |
