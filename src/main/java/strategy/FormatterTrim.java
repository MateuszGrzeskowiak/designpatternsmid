package strategy;

public class FormatterTrim implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.trim();
    }
}
