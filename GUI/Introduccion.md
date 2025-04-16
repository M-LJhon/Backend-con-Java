# Interfaces gráficas de usuario (GUI).
Las interfaces gráficas de usuario o GUI, le permiten al usuario interactuar con el sistema o software informático sin necesidad de una terminal, sino de una interfaz o fronted, siendo así intuitivo, flexible y amigable, todo esto enfocado a la experiencia de usuario.
![Imagen de referencia a las interfaces gráficas de usuario (GUI)](/_Imagenes/+0_Interfaz_Gui.jpg)

## POE.
![Imagen de referencia a POE](/_Imagenes/+0_Poe.png)
La Programación Orientada a Eventos es crucial al momento de hablar de GUI, ya que nos permite reconocer la interacción del usuario con el software a través de dispositivos conectados y reconocidos por el ordenador, todo ello a través de la BIOS (Basic input output system). Como desarrolladores podemos usar la POE para programar la reacción del sistema de información al momento de usar estos dispositivos según lo necesitemos, por consigiente debemos de conocer los dispositivos **convencionales** y **no convencionales**.

# Cuadro Descriptivo de Dispositivos en Java y sus Eventos

## Dispositivos Convencionales

### 1. Teclado

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | ⌨️ |
| **Nombre Dispositivo** | Teclado (Keyboard) |
| **Definición** | Dispositivo de entrada que permite al usuario introducir caracteres, comandos y datos mediante pulsaciones de teclas. |
| **Convencional** | Sí |
| **Tipo de dispositivo** | Entrada |
| **Eventos en Java** | - `KeyEvent.KEY_PRESSED`: Ocurre cuando una tecla es presionada.<br>- `KeyEvent.KEY_RELEASED`: Ocurre cuando una tecla es liberada.<br>- `KeyEvent.KEY_TYPED`: Ocurre cuando se completa la pulsación de una tecla (presión y liberación).<br><br>Los eventos de teclado se manejan implementando la interfaz `KeyListener` con métodos como:<br>- `keyPressed(KeyEvent e)`<br>- `keyReleased(KeyEvent e)`<br>- `keyTyped(KeyEvent e)` |

### 2. Ratón

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 🖱️ |
| **Nombre Dispositivo** | Ratón (Mouse) |
| **Definición** | Dispositivo de entrada que permite al usuario interactuar con elementos gráficos mediante movimientos y clics. |
| **Convencional** | Sí |
| **Tipo de dispositivo** | Entrada |
| **Eventos en Java** | - `MouseEvent.MOUSE_CLICKED`: Ocurre cuando se hace clic con el mouse.<br>- `MouseEvent.MOUSE_PRESSED`: Ocurre cuando se presiona un botón del mouse.<br>- `MouseEvent.MOUSE_RELEASED`: Ocurre cuando se suelta un botón del mouse.<br>- `MouseEvent.MOUSE_MOVED`: Ocurre cuando el mouse se mueve sin presionar botones.<br>- `MouseEvent.MOUSE_DRAGGED`: Ocurre cuando se mueve el mouse mientras se mantiene presionado un botón.<br>- `MouseEvent.MOUSE_ENTERED`: Ocurre cuando el cursor entra en un componente.<br>- `MouseEvent.MOUSE_EXITED`: Ocurre cuando el cursor sale de un componente.<br><br>Se implementan con las interfaces:<br>- `MouseListener`<br>- `MouseMotionListener`<br>- `MouseWheelListener` |

### 3. Monitor

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 🖥️ |
| **Nombre Dispositivo** | Monitor (Display) |
| **Definición** | Dispositivo de salida que muestra visualmente información, textos, gráficos e interfaces de usuario. |
| **Convencional** | Sí |
| **Tipo de dispositivo** | Salida |
| **Eventos en Java** | - `ComponentEvent.COMPONENT_RESIZED`: Cuando la ventana o componente cambia de tamaño.<br>- `ComponentEvent.COMPONENT_MOVED`: Cuando el componente se mueve.<br>- `ComponentEvent.COMPONENT_SHOWN`: Cuando el componente se hace visible.<br>- `ComponentEvent.COMPONENT_HIDDEN`: Cuando el componente se oculta.<br>- `WindowEvent.WINDOW_CLOSING`: Cuando se intenta cerrar la ventana.<br><br>Implementados con:<br>- `ComponentListener`<br>- `WindowListener` |

### 4. Impresora

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 🖨️ |
| **Nombre Dispositivo** | Impresora (Printer) |
| **Definición** | Dispositivo de salida que genera representaciones físicas (impresas) de textos o gráficos. |
| **Convencional** | Sí |
| **Tipo de dispositivo** | Salida |
| **Eventos en Java** | - `PrintJobEvent.DATA_TRANSFER_COMPLETE`: Cuando se completa la transferencia de datos.<br>- `PrintJobEvent.NO_MORE_EVENTS`: Cuando no hay más eventos de impresión.<br>- `PrintJobEvent.JOB_CANCELED`: Cuando se cancela un trabajo de impresión.<br>- `PrintJobEvent.JOB_COMPLETE`: Cuando se completa un trabajo de impresión.<br>- `PrintJobEvent.JOB_FAILED`: Cuando falla un trabajo de impresión.<br><br>Implementados con la interfaz:<br>- `PrintJobListener` |

## Dispositivos No Convencionales

### 5. Pantalla Táctil

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 📱 |
| **Nombre Dispositivo** | Pantalla Táctil (Touchscreen) |
| **Definición** | Dispositivo que combina entrada y salida permitiendo la interacción directa a través del tacto en la pantalla. |
| **Convencional** | No |
| **Tipo de dispositivo** | Entrada/Salida |
| **Eventos en Java** | En JavaFX:<br>- `TouchEvent.TOUCH_PRESSED`: Cuando se toca la pantalla.<br>- `TouchEvent.TOUCH_MOVED`: Cuando se mueve el dedo sobre la pantalla.<br>- `TouchEvent.TOUCH_RELEASED`: Cuando se deja de tocar la pantalla.<br>- `TouchEvent.TOUCH_STATIONARY`: Cuando el toque permanece estático.<br><br>En Android (Java):<br>- `MotionEvent.ACTION_DOWN`: Cuando el dedo toca la pantalla.<br>- `MotionEvent.ACTION_MOVE`: Cuando el dedo se mueve sobre la pantalla.<br>- `MotionEvent.ACTION_UP`: Cuando el dedo se levanta.<br>- `MotionEvent.ACTION_POINTER_DOWN`: Para toques múltiples.<br><br>Manejados con:<br>- `TouchEvent.EventHandler`<br>- `OnTouchListener` (Android) |

### 6. Sensor de Movimiento

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 📳 |
| **Nombre Dispositivo** | Sensor de Movimiento (Motion Sensor) |
| **Definición** | Dispositivo que detecta cambios en posición, orientación o movimiento físico. |
| **Convencional** | No |
| **Tipo de dispositivo** | Entrada |
| **Eventos en Java** | En Android (Java):<br>- `SensorEvent.TYPE_ACCELEROMETER`: Detecta cambios en aceleración.<br>- `SensorEvent.TYPE_GYROSCOPE`: Detecta cambios en rotación.<br>- `SensorEvent.TYPE_GRAVITY`: Detecta la gravedad.<br>- `SensorEvent.TYPE_ROTATION_VECTOR`: Detecta orientación.<br><br>Implementados con:<br>- `SensorEventListener`<br>- Métodos: `onSensorChanged(SensorEvent event)`<br>- `onAccuracyChanged(Sensor sensor, int accuracy)` |

### 7. Cámara Web

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 📷 |
| **Nombre Dispositivo** | Cámara Web (Webcam) |
| **Definición** | Dispositivo de entrada que captura imágenes y video en tiempo real. |
| **Convencional** | No |
| **Tipo de dispositivo** | Entrada |
| **Eventos en Java** | Con bibliotecas como JavaCV o Webcam Capture:<br>- `WebcamDiscoveryEvent.ADDED`: Cuando se conecta una cámara.<br>- `WebcamDiscoveryEvent.REMOVED`: Cuando se desconecta una cámara.<br>- `WebcamEvent.OPEN`: Cuando la cámara se inicializa.<br>- `WebcamEvent.CLOSED`: Cuando la cámara se apaga.<br>- `WebcamEvent.DISPOSED`: Cuando la cámara se elimina del sistema.<br>- `WebcamEvent.IMAGE_OBTAINED`: Cuando se captura una imagen.<br><br>Implementados con:<br>- `WebcamListener`<br>- `WebcamDiscoveryListener` |

### 8. Reconocimiento de Voz

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 🎤 |
| **Nombre Dispositivo** | Reconocimiento de Voz (Voice Recognition) |
| **Definición** | Sistema que procesa comandos de voz para convertirlos en texto o acciones. |
| **Convencional** | No |
| **Tipo de dispositivo** | Entrada |
| **Eventos en Java** | Con bibliotecas como CMU Sphinx o Cloud Speech API:<br>- `RecognitionEvent.SPEECH_STARTED`: Cuando comienza la detección de voz.<br>- `RecognitionEvent.SPEECH_ENDED`: Cuando termina la detección de voz.<br>- `RecognitionEvent.RESULT_AVAILABLE`: Cuando hay resultados disponibles.<br>- `RecognitionEvent.RESULT_REJECTED`: Cuando se rechaza un resultado.<br>- `RecognitionEvent.RESULT_ACCEPTED`: Cuando se acepta un resultado.<br><br>Implementados con:<br>- `RecognitionListener`<br>- Métodos como: `onResults(Bundle results)`<br>- `onBeginningOfSpeech()` |

### 9. Lector de Huellas Digitales

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 👆 |
| **Nombre Dispositivo** | Lector de Huellas Digitales (Fingerprint Scanner) |
| **Definición** | Dispositivo que captura y procesa las huellas dactilares para autenticación biométrica. |
| **Convencional** | No |
| **Tipo de dispositivo** | Entrada |
| **Eventos en Java** | En Android (Java):<br>- `BiometricPrompt.ERROR`: Cuando ocurre un error en la autenticación.<br>- `BiometricPrompt.AUTHENTICATION_RESULT`: Cuando la autenticación es exitosa.<br>- `BiometricPrompt.AUTHENTICATION_FAILED`: Cuando la autenticación falla.<br><br>Implementados con:<br>- `BiometricPrompt.AuthenticationCallback`<br>- Métodos como: `onAuthenticationSucceeded()`<br>- `onAuthenticationFailed()` |

### 10. Control de Realidad Virtual

| Campo | Descripción |
|-------|-------------|
| **Gráfica del dispositivo** | 🥽 |
| **Nombre Dispositivo** | Control de Realidad Virtual (VR Controller) |
| **Definición** | Dispositivo que permite interactuar con entornos virtuales mediante movimientos en el espacio 3D. |
| **Convencional** | No |
| **Tipo de dispositivo** | Entrada/Salida |
| **Eventos en Java** | Utilizando APIs como LWJGL o Java 3D:<br>- `VREvent.CONTROLLER_BUTTON_PRESSED`: Cuando se presiona un botón.<br>- `VREvent.CONTROLLER_BUTTON_RELEASED`: Cuando se suelta un botón.<br>- `VREvent.CONTROLLER_MOVED`: Cuando se mueve el control.<br>- `VREvent.CONTROLLER_AXIS_CHANGED`: Cuando cambia la posición de un joystick.<br><br>Implementados con:<br>- `VRControllerListener`<br>- Métodos como: `onControllerStateChanged()` |

