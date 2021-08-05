# Autor: Alberto Caballero
  @stories
  Feature: Validate PDF document
    As a user, i want to open an PDF document into the Grupo Bancolombia Page
  @scenario1
  Scenario: Search for the PDF document about Politicas de tratamiento y de proteccion de datos personales
    Given than Helen want to search an PDF document
    When she search for the document
    Then she finds the PDF document about Politicas de tratamiento y de proteccion de datos personales
    |          urlText             |
    |proveedores-grupo-bancolombia |

  @scenario2
  Scenario: Search the PDF document about Tasas de Tarjetas de credito
    Given than Helen want to search data about tarjetas de credito
    When she search for information
    Then she finds the PDF document about Tasas de Tarjetas de crédito
    |      urlTextTarjetaDeCredito         |
    |   Formato+consolidado+Tasas          |