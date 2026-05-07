//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// 1. Definirea arhitecturii (interfete si contracte)
        /// Creeaza o interfata numita Device care sa extinda Serializable. Interfata trebeui sa impuna doua metode: Integer getId() - pentru identificarea unica a dispozitbului. String toText() - pentru serializarea manuala a obiectului intr-un format text (ex: valori separate prin punct si virugla)

        /// 2. Implementarea Modelelor de date
        /// Creeaza clasa Laptop care implementeaza Device. Campuri: id, model, ram. Creeaza clasa Smartphone care implementeaza Device. Campuri: id, model, cameraMP. Pentru ambele clase, implementeaza metoda toText() astfel incat sa returneze un sir de caractere ce include tipul dispozitibului si toate atributele sale (ex: "LAPTOP;1;Asus;16". Suprascrie metoda toString() pentru o afisare lizibila in consola.)
    }
}
