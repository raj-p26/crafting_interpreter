enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,
    HASH,

    // One or two character tokens.
    BANG, BANG_EQUAL, EQUAL,
    EQUAL_EQUAL, STAR_STAR,
    GREATER, GREATER_EQUAL,
    LESS, LESS_EQUAL,

    // Literals.
    IDENTIFIER, STRING, NUMBER,

    // Keywords.
    AND, CLASS, ELSE, FALSE, FN, FOR, IF, LET, NIL, OR,
    PRINT, RETURN, SUPER, SELF, TRUE, WHILE,

    EOF
}
