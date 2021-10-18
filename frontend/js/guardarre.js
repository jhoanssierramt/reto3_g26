function guardar(){
    console.log("ejecutando funcion guardar");

    let reservation = {
        idReservation: +$("#idReservation").val(),
        startDate: $("#startDate").val(),
        devolutionDate: $("#devolutionDate").val(),
        id: $("#id").val(),
        idClient: $("#idClient").val()
    }; 

    console.log(reservation);

    $.ajax({
        url: "localhost:8080/api/Reservation/save",
        type: 'POST',
        dataType: 'json',
        headers: {
            "Content-Type": "application/json"
        },
        data: JSON.stringify(reservation),
        statusCode:{
            201:function(){
                alert('Se ha registrado la reserva');
            }
        },
    });
}