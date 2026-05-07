import java.io.Serializable;

public interface Device extends Serializable {
    /// 1. Definirea arhitecturii (interfete si contracte)
    /// Creeaza o interfata numita Device care sa extinda Serializable. Interfata trebeui sa impuna doua metode: Integer getId() - pentru identificarea unica a dispozitbului. String toText() - pentru serializarea manuala a obiectului intr-un format text (ex: valori separate prin punct si virugla)

    Integer getId();

    String toText();
}
