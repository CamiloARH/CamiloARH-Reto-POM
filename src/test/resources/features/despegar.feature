 Feature: Busqueda y selección de tiquetes áereos Despegar
  Yo como cliente quiero tener la posibilidad de buscar y separar
  vuelos áereos en la página despegar.com

   @ticket1
  Scenario: Selección de vielos de solo ida
    Given el cliente se encuentra en la pagina principal
    When el cliente selecciona el lugar de destino
    And llena el formulario de datos personales y confirma su información
    Then la página deberá mostrar los datos ingresados

   @ticket2
  Scenario: Selección de vuelos de ida y vuelta
    Given el cliente esta la pagina principal
    When el cliente selecciona un lugar de destino y las fechas
    And llena los formulario de datos personales y confirma su información
    Then el cliente vera los datos ingresados en la parte inferior
