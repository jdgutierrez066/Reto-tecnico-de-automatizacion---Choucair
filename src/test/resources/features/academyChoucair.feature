#Autor: Juan David Gutierrez Rodriguez
  @stories
  Feature: Academy Choucair
    Como usuario no registrado, quiero registrarme en la uTest con el fin de probar
  @scenario1
  Scenario: Registrarse la pagina uTest
    Given Dado que Juan quiere probar su codigo automatizacion abrimos la pagina Utest.com
    When  Cuando abre el formulario registro, se llenan todos los campos
    | strFirtsName | strLastName         | strEmail                     | strMoth | strDay | strYear | strCity| strZip | strCountry| strComputer|strVersion|strLanguage|strMobileDevice|strModel   |strOperatingSystem|strPassword | strRepassword|
    | Juan David   | Gutierrez Rodriguez | juanprueba29@gmail.com       | May     | 29     | 2000    | bogota | 110111 | Colombia  | Windows    |11        | spanish   |samsung        |galaxy s9  |android 10        | Juandavid29| Juandavid29 |
    Then  Luego se registra correctamente el usuario encuentra el mensaje
    | question                                                                |
    | Welcome to the world's largest community of freelance software testers! |