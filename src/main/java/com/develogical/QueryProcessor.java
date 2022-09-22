package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("poe")) {
            return "Edgar Allan Poe (19 January 1809 - 7 October 1849) was an " +
                    "American poet, writer, and literary critic, widely regarded as a central figure of " +
                    "Romanticism in the United States, and of American literature.";
        }
        return "";
    }
}
