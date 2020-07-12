package strategy;

public class FormatterUpper implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toUpperCase();
    }
}