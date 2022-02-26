package enumType;

import java.util.Set;

public class TextWithEnumSet {

    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    public void applyStyles(Set<Style> styles) {

    }

    // text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
}
