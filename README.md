Mercado Campesino Digital de Yopal

1. Descripción del proyecto

El Mercado Campesino Digital de Yopal es una plataforma web que busca facilitar la venta de productos agrícolas y campesinos. El sistema permitirá a los productores publicar sus ofertas, a los clientes reservar productos y a la Secretaría de Desarrollo Económico consultar reportes de ventas.

2. Objetivo

Desarrollar una plataforma web sencilla que mejore la organización de los pedidos, ayude a reducir los productos que quedan sin vender y facilite el seguimiento de las ventas del mercado campesino.

3. Funcionalidades principales

Registro de productores y clientes.

Publicación semanal de productos, cantidades y precios.

Consulta de productos disponibles.

Reserva de productos hasta el viernes a las 6:00 p. m.

Recogida de productos los sábados en el puesto del productor.

Reportes de ventas por producto, productor y vereda.

Protección de los datos personales de los usuarios.

4. Tecnologías propuestas

Frontend: HTML, CSS y JavaScript.

Backend: Java con Spring Boot.

Base de datos: MySQL.

Control de versiones: Git y GitHub.

5. Estructura del proyecto

mercado-campesino-digital-yopal/
├── README.md
├── .gitignore
├── docs/
│   └── prototipos/
├── frontend/
│   ├── index.html
│   ├── css/
│   ├── js/
│   └── img/
├── backend/
│   └── src/
├── database/
│   └── schema.sql
└── tests/

6. Estrategia de ramas

Para organizar el desarrollo se utilizará la siguiente estrategia:

main: contiene la versión estable del proyecto.

develop: integra las funcionalidades antes de incorporarlas a la versión estable.

feature/publicar-oferta: desarrollo de la publicación de productos.

feature/reservas: desarrollo de las reservas de los clientes.

feature/reportes: desarrollo de los reportes de ventas.

fix/nombre-error: corrección de errores encontrados.

Los cambios se probarán y se integrarán mediante Pull Requests antes de incorporarse a la rama principal.

7. Alcance inicial

La primera versión permitirá publicar productos, consultar ofertas, gestionar reservas y generar reportes de ventas. Los domicilios en toda la ciudad y los pagos en línea no estarán incluidos en esta versión.

8. Consideraciones

El sistema tendrá en cuenta la facilidad de uso desde celulares Android, la conectividad intermitente de las zonas rurales y la protección de datos personales de acuerdo con la Ley 1581 de 2012.

9. Estado del proyecto

Proyecto en fase de análisis y diseño.
