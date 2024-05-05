import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gramatica{
	private char[] simbolosNoTerminales;
	private char[] alfabeto;
	private char simboloInicial;
	private String[][] reglasDeProduccion;

	public Gramatica(String pathArchivo){
		// Se lee el archivo y se almacena la informacion en las variables
		String[] contenido = readFile(pathArchivo).split("\n");
		// Se guardan los simbolos no terminales
		String[] simbolos = contenido[0].split(",");
		simbolosNoTerminales = new char[simbolos.length];
		for (int i = 0; i < simbolos.length; i++) {
			simbolosNoTerminales[i] = simbolos[i].charAt(0);
		}

		// Se guarda el alfabeto
		String[] simbolosTerminales = contenido[1].split(",");
		alfabeto = new char[simbolosTerminales.length];
		for (int i = 0; i < simbolosTerminales.length; i++) {
			alfabeto[i] = simbolosTerminales[i].charAt(0);
		}
		// Se guarda el simbolo inicial
		simboloInicial = contenido[2].charAt(0);

		int rows = contenido.length - 3; // Se restan 3 porque las primeras 3 lineas no son reglas de produccion

		// Se guardan las reglas de produccion
		reglasDeProduccion = new String[rows][2];
		for (int row = 0; row <= rows; row++) {
			String[] reglas = contenido[row + 3].split("->"); // Se suma 3 porque las primeras 3 lineas no son reglas
			for (int col = 0; col < 2; col++) {
				reglasDeProduccion[row][col] = reglas[col]; // Se guarda la transicion en la matriz
			}
		}
	}

	private String[][] factorizar(String[][] reglasDeProduccion){
		int rows = reglasDeProduccion.length;
		for (int row = 0; row <= rows; row++) {
			String[] reglas = reglasDeProduccion[row];
			String[] reglas2 = reglasDeProduccion[row + 1];
			if (reglas[0].equals(reglas2[0])){
				// Se factoriza
				String[] reglasNuevas = new String[2];
				reglasNuevas[0] = reglas[0];
				reglasNuevas[1] = reglas[1] + "|" + reglas2[1];
				reglasDeProduccion[row] = reglasNuevas;
				// Se elimina la regla repetida
				for (int i = row + 1; i < rows; i++) {
					reglasDeProduccion[i] = reglasDeProduccion[i + 1];
				}
				rows--;
			}
		}
		return reglasDeProduccion;
	}

	public String readFile(String path){
		// Implementar la lectura del archivo
		StringBuilder contenido = new StringBuilder();
		try (BufferedReader buff = new BufferedReader(new FileReader(path))) {
            String linea;
			// Leer el archivo linea por linea y almacenar el contenido en un StringBuilder
            while ((linea = buff.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido.toString();
	}


	public static void main(String[] args) throws Exception{
		// Verificar que se haya proporcionado un archivo de entrada
		if (args.length < 1) {
			System.out.println("No se proporciono el archivo de entrada.");
			return;
		}
		// Crear un AFN con el archivo de entrada
		Gramatica afn = new Gramatica(args[0]);
		String bandera = null;
		if (args.length > 1) {
			bandera = args[1];
		}
		if (bandera != null && bandera.equals("-afn")){
			String pathArchivoAFD = null;
			if (args.length > 2) {
				pathArchivoAFD = args[2];
			}
			// Si no se da el path, se crea uno por defecto
			if (pathArchivoAFD == null) {
				pathArchivoAFD = "./AFNconvertido.afd";
			}
			// Crear un AFD con el archivo de entrada
			afn.toAFD(pathArchivoAFD);
			System.out.printf("Se ha creado el archivo AFD exitosamente en: %s.\n", pathArchivoAFD);
		}else if (bandera != null && bandera.equals("-afd")){
			String pathArchivoAFD = null;
			if (args.length > 2) {
				pathArchivoAFD = args[2];
			}
			// Si no se da el path, se crea uno por defecto
			if (pathArchivoAFD == null) {
				pathArchivoAFD = "./AFDconvertido.afd";
			}
			// Crear un AFD con el archivo de entrada
			afn.toAFD(pathArchivoAFD);
			System.out.printf("Se ha creado el archivo AFD exitosamente en: %s.\n", pathArchivoAFD);
		}else if (bandera != null && bandera.equals("-check")){
			// Verificar si la cadena es aceptada por la gramatica
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese la cuerda a verificar:");
			String cuerda = br.readLine();
			if (afn.check(cadena)){
				System.out.println("La cuerda es aceptada por la gramatica.");
			}else{
				System.out.println("La cuerda no es aceptada por la gramatica.");
			}
		}
	}
}