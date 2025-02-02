package cora.parser;

import graphql.language.Definition;

import java.util.List;

public interface CoraParser {
    List<Definition> parseSchema(String schema);

    boolean isValid(String schema);
}
