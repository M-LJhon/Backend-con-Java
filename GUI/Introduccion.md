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

# Componentes Principales de Java Swing

| Componente | Qué hace | Para qué se usa | Cómo se implementa |
|------------|----------|-----------------|-------------------|
| JFrame | Proporciona una ventana principal con título y borde. | Es el contenedor principal de la aplicación donde se colocan los demás componentes. | `JFrame frame = new JFrame("Título de la Ventana");`<br>`frame.setSize(400, 300);`<br>`frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`<br>`frame.setVisible(true);` |
| JPanel | Contenedor ligero sin decoración. | Se usa para agrupar y organizar componentes relacionados, aplicar layout managers o dividir la interfaz en secciones. | `JPanel panel = new JPanel();`<br>`panel.setLayout(new FlowLayout());`<br>`frame.add(panel);` |
| JButton | Crea un botón con texto y/o ícono que puede ser presionado. | Para iniciar acciones cuando el usuario hace clic. | `JButton button = new JButton("Clic Aquí");`<br>`button.addActionListener(e -> System.out.println("Botón presionado"));`<br>`panel.add(button);` |
| JLabel | Muestra texto o imágenes no editables. | Para mostrar información, etiquetas, descripciones o imágenes. | `JLabel label = new JLabel("Este es un texto de etiqueta");`<br>`panel.add(label);` |
| JTextField | Campo para entrada de texto en una sola línea. | Para recoger datos del usuario como nombres, direcciones, etc. | `JTextField textField = new JTextField(20); // 20 columnas de ancho`<br>`panel.add(textField);` |
| JTextArea | Campo para entrada de texto multilinea. | Para texto largo como comentarios o descripciones. | `JTextArea textArea = new JTextArea(5, 20); // 5 filas, 20 columnas`<br>`textArea.setLineWrap(true);`<br>`panel.add(new JScrollPane(textArea)); // Con scrollbar` |
| JComboBox | Lista desplegable de opciones. | Para seleccionar una opción entre varias disponibles. | `String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};`<br>`JComboBox<String> comboBox = new JComboBox<>(opciones);`<br>`panel.add(comboBox);` |
| JCheckBox | Caja de verificación que puede estar marcada o desmarcada. | Para opciones booleanas (sí/no) o selecciones múltiples independientes. | `JCheckBox checkBox = new JCheckBox("Acepto los términos");`<br>`panel.add(checkBox);` |
| JRadioButton | Botón de opción que puede estar seleccionado o no. | Para seleccionar una opción entre varias mutuamente excluyentes. | `JRadioButton radio1 = new JRadioButton("Opción A");`<br>`JRadioButton radio2 = new JRadioButton("Opción B");`<br>`ButtonGroup group = new ButtonGroup();`<br>`group.add(radio1);`<br>`group.add(radio2);`<br>`panel.add(radio1);`<br>`panel.add(radio2);` |
| JTable | Muestra datos en formato de tabla con filas y columnas. | Para presentar información estructurada en forma tabular. | `String[] columnas = {"Nombre", "Edad", "Ciudad"};`<br>`Object[][] datos = {`<br>`    {"Juan", 25, "Madrid"},`<br>`    {"Ana", 30, "Barcelona"}`<br>`};`<br>`JTable table = new JTable(datos, columnas);`<br>`panel.add(new JScrollPane(table));` |
| JList | Lista de elementos seleccionables. | Para mostrar una lista de opciones donde se pueden seleccionar uno o varios elementos. | `String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3"};`<br>`JList<String> lista = new JList<>(elementos);`<br>`panel.add(new JScrollPane(lista));` |
| JScrollPane | Añade barras de desplazamiento a componentes. | Para componentes con contenido que puede ser más grande que el área visible. | `JTextArea textArea = new JTextArea(10, 20);`<br>`JScrollPane scrollPane = new JScrollPane(textArea);`<br>`panel.add(scrollPane);` |
| JMenuBar, JMenu, JMenuItem | Componentes para crear menús desplegables. | Para organizar funcionalidades en menús al estilo de aplicaciones de escritorio tradicionales. | `JMenuBar menuBar = new JMenuBar();`<br>`JMenu menu = new JMenu("Archivo");`<br>`JMenuItem menuItem = new JMenuItem("Abrir");`<br>`menu.add(menuItem);`<br>`menuBar.add(menu);`<br>`frame.setJMenuBar(menuBar);` |
| JToolBar | Barra de herramientas con botones y otros componentes. | Para acceso rápido a funciones frecuentes. | `JToolBar toolBar = new JToolBar();`<br>`toolBar.add(new JButton("Nuevo"));`<br>`toolBar.add(new JButton("Abrir"));`<br>`frame.add(toolBar, BorderLayout.NORTH);` |
| JTabbedPane | Panel con pestañas para cambiar entre diferentes contenidos. | Para organizar contenido en categorías o secciones. | `JTabbedPane tabbedPane = new JTabbedPane();`<br>`tabbedPane.addTab("Pestaña 1", panel1);`<br>`tabbedPane.addTab("Pestaña 2", panel2);`<br>`frame.add(tabbedPane);` |
| JSlider | Control deslizante para seleccionar valores numéricos. | Para ajustar configuraciones numéricas como volumen, brillo, etc. | `JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);`<br>`slider.setMajorTickSpacing(20);`<br>`slider.setPaintTicks(true);`<br>`slider.setPaintLabels(true);`<br>`panel.add(slider);` |
| JProgressBar | Barra que muestra el progreso de una operación. | Para visualizar el avance de tareas que requieren tiempo. | `JProgressBar progressBar = new JProgressBar(0, 100);`<br>`progressBar.setValue(50);`<br>`progressBar.setStringPainted(true);`<br>`panel.add(progressBar);` |
| JFileChooser | Diálogo para navegar y seleccionar archivos. | Para abrir o guardar archivos. | `JFileChooser fileChooser = new JFileChooser();`<br>`int result = fileChooser.showOpenDialog(frame);`<br>`if (result == JFileChooser.APPROVE_OPTION) {`<br>`    File selectedFile = fileChooser.getSelectedFile();`<br>`}` |
| JColorChooser | Diálogo para seleccionar colores. | Para permitir al usuario elegir un color. | `Color color = JColorChooser.showDialog(frame, "Seleccione un color", Color.BLUE);` |
| JSplitPane | Panel dividido en dos secciones con divisor ajustable. | Para interfaces que necesitan mostrar dos componentes cuyo tamaño relativo puede cambiarse. | `JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,`<br>`                                componenteIzquierda, componenteDerecha);`<br>`splitPane.setDividerLocation(150);`<br>`frame.add(splitPane);` |

# Métodos Principales de Java Swing

| Método | Qué hace | Para qué se usa | Cómo se implementa |
|--------|----------|-----------------|-------------------|
| `setSize()` | Establece el tamaño de un componente. | Para definir las dimensiones (ancho y alto) de ventanas o componentes. | `frame.setSize(400, 300); // ancho, alto en píxeles` |
| `setVisible()` | Muestra u oculta un componente. | Para controlar la visibilidad de componentes, especialmente al iniciar una aplicación. | `frame.setVisible(true); // muestra el componente` |
| `setLayout()` | Define el gestor de diseño de un contenedor. | Para organizar la disposición de los componentes dentro de un contenedor. | `panel.setLayout(new FlowLayout());` |
| `add()` | Añade un componente a un contenedor. | Para incluir componentes dentro de contenedores como JFrame o JPanel. | `panel.add(button);` |
| `addActionListener()` | Registra un listener para eventos de acción. | Para detectar y responder a eventos como clics en botones. | `button.addActionListener(e -> System.out.println("Clic"));` |
| `setDefaultCloseOperation()` | Define el comportamiento al cerrar una ventana. | Para especificar qué debe ocurrir cuando el usuario cierra la ventana principal. | `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);` |
| `setText()` | Cambia el texto de un componente. | Para actualizar dinámicamente el texto mostrado en componentes como JLabel o JButton. | `label.setText("Nuevo texto");` |
| `getText()` | Obtiene el texto actual de un componente. | Para recuperar el texto ingresado por el usuario en campos de texto. | `String texto = textField.getText();` |
| `setEnabled()` | Habilita o deshabilita un componente. | Para controlar si un componente puede recibir interacción del usuario. | `button.setEnabled(false); // deshabilita el botón` |
| `setBackground()` | Establece el color de fondo. | Para personalizar la apariencia visual de componentes. | `panel.setBackground(Color.LIGHT_GRAY);` |
| `setForeground()` | Establece el color del texto. | Para cambiar el color del texto en componentes. | `label.setForeground(Color.BLUE);` |
| `setFont()` | Define la fuente del texto. | Para personalizar el tipo, estilo y tamaño de letra. | `label.setFont(new Font("Arial", Font.BOLD, 14));` |
| `setBounds()` | Establece la posición y tamaño. | Para posicionar componentes cuando se usa null layout. | `button.setBounds(50, 100, 80, 30); // x, y, ancho, alto` |
| `setTitle()` | Establece el título de una ventana. | Para mostrar un texto identificativo en la barra de título. | `frame.setTitle("Mi Aplicación");` |
| `setIcon()` | Asigna un icono a un componente. | Para añadir imágenes a botones o etiquetas. | `button.setIcon(new ImageIcon("icono.png"));` |
| `setToolTipText()` | Define el texto de ayuda. | Para mostrar información al pasar el ratón sobre un componente. | `button.setToolTipText("Haz clic para guardar");` |
| `setSelected()` | Selecciona o deselecciona un componente. | Para establecer el estado inicial de componentes como checkboxes o radiobuttons. | `checkBox.setSelected(true);` |
| `isSelected()` | Verifica si un componente está seleccionado. | Para comprobar el estado actual de checkboxes o radiobuttons. | `boolean seleccionado = checkBox.isSelected();` |
| `setEditable()` | Controla si un texto puede ser editado. | Para permitir o impedir que el usuario modifique el texto. | `textArea.setEditable(false); // solo lectura` |
| `requestFocus()` | Solicita el foco de entrada. | Para dirigir el foco del teclado a un componente específico. | `textField.requestFocus();` |
| `revalidate()` | Recalcula el diseño de un contenedor. | Para actualizar la disposición después de añadir o quitar componentes. | `panel.revalidate();` |
| `repaint()` | Solicita un redibujado del componente. | Para actualizar la apariencia visual después de cambios. | `panel.repaint();` |
| `pack()` | Ajusta el tamaño del contenedor a sus componentes. | Para dimensionar una ventana al tamaño óptimo según su contenido. | `frame.pack();` |
| `setLocationRelativeTo()` | Centra un componente respecto a otro. | Para posicionar ventanas en el centro de la pantalla u otro componente. | `frame.setLocationRelativeTo(null); // centrar en pantalla` |
| `setResizable()` | Permite o impide redimensionar una ventana. | Para controlar si el usuario puede cambiar el tamaño de la ventana. | `frame.setResizable(false);` |
| `addKeyListener()` | Registra un listener para eventos de teclado. | Para detectar y responder a pulsaciones de teclas. | `textField.addKeyListener(new KeyAdapter() { // implementación });` |
| `addMouseListener()` | Registra un listener para eventos de ratón. | Para detectar y responder a acciones del ratón como clics o movimientos. | `panel.addMouseListener(new MouseAdapter() { // implementación });` |
| `setPreferredSize()` | Establece el tamaño preferido. | Para sugerir dimensiones óptimas al gestor de diseño. | `button.setPreferredSize(new Dimension(100, 30));` |
| `setBorder()` | Define el borde de un componente. | Para añadir bordes decorativos o funcionales. | `panel.setBorder(BorderFactory.createTitledBorder("Datos"));` |
| `showMessageDialog()` | Muestra un diálogo de mensaje. | Para mostrar información o alertas al usuario. | `JOptionPane.showMessageDialog(frame, "Mensaje", "Título", JOptionPane.INFORMATION_MESSAGE);` |
| `showConfirmDialog()` | Muestra un diálogo de confirmación. | Para solicitar confirmación al usuario antes de una acción. | `int opcion = JOptionPane.showConfirmDialog(frame, "¿Continuar?");` |
| `showInputDialog()` | Muestra un diálogo de entrada. | Para solicitar datos al usuario mediante una ventana emergente. | `String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");` |
| `invokeLater()` | Ejecuta código en el hilo de eventos. | Para asegurar que las operaciones de UI se ejecuten en el hilo adecuado. | `SwingUtilities.invokeLater(() -> { // código de UI });` |
| `setJMenuBar()` | Establece la barra de menú de un JFrame. | Para añadir menús a una ventana. | `frame.setJMenuBar(menuBar);` |
| `setValue()` | Establece el valor actual de un componente. | Para actualizar progresivamente componentes como JProgressBar o JSlider. | `progressBar.setValue(75);` |
| `setSelectionMode()` | Define el modo de selección. | Para especificar si se pueden seleccionar múltiples elementos en listas o tablas. | `list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);` |

