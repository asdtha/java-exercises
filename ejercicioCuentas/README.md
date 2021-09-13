Parte I

Relaciones, herencia, clase, métodos abstractos e interfaces

Objetivo
Identificar e implementar en Java las clases involucradas en el enunciado especificando sus atributos, responsabilidades y relaciones entre las mismas.

Enunciado
El Banco Nacional nos solicita modelar un nuevo sistema. Este sistema llevará el registro de las cuentas y de los clientes del banco. 
Clientes: los clientes se identificarán con un número de cliente, con un apellido, un DNI y un CUIT.
Cuentas: las cuentas de nuestro banco permiten depositar, extraer efectivo e informar saldo. Una cuenta tiene un cliente asociado.

Extensión:
Caja de ahorro: las cajas de ahorro poseen un saldo y además una tasa de interés. En este tipo de cuenta se pueden realizar tres operaciones:
○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
○ Extraer efectivo: el cliente puede extraer dinero sin excederse de su saldo.
○ Cobrar interés: el cliente puede cobrar los intereses que su caja de ahorro le otorga mensualmente.

Cuenta corriente: las cuentas corrientes poseen un saldo y además un monto autorizado
para girar en descubierto. En este tipo de cuenta se pueden realizar tres operaciones:
○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
○ Extraer efectivo: el cliente puede extraer dinero y utilizar su giro en descubierto en caso de que no tenga saldo suficiente.
○ Gravar impuesto: se gravará impuesto de su saldo según porcentaje establecido

Aclaración: Para este ejercicio tené en cuenta que Cuenta es posible modelarla como una clase abstracta y si bien una cuenta tiene varias responsabilidades como muestra el
enunciado puede que alguna se tenga que comportar diferente en las subclases y sea posible método abstracto.

Parte II

Objetivo
Aplicar sobrecarga y sobreescritura de métodos

Enunciado
Adicionalmente, implementar una Cuenta Comitente. Las cuentas comitentes tienen una clave de validación de la CNV (string). Este tipo de cuenta al depositar se quedan con un
1% de la comisión con lo cual al depositar solo nos depositara el 99% del monto (no nos preocupemos a dónde irá ese 1%). Por otro lado, solo se puede extraer hasta el
50% en una operación, excepto que se suministre al momento de la extracción la clave de validación. Es decir que para extraer deben existir estas dos posibilidades.

