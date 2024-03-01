# encoding: UTF-8

Feature: Abrir la Pagina Banistmo
  yo como usuario quiero ingresar a la pagina Banistmo
  para ingresar a la pestaña proveedores y validar la pantalla emergente

  Background:
    Given abro la pagina principal de Banistmo

 @Open @Regresion
 Scenario: Verifico el contenido
   When ingreso a infomacion coorporativa y proveedores
   Then debo validar la ventana emergente
   And Descargo el PDF
   Then Valido el documento


