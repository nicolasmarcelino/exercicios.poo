class Main {
    public static void main(String[] args) {
        BROfficeDocument doc1 = new BROfficeDocument("This is a BROfficeDocument.");
        
        WordDocument doc2 = new WordDocument("This a .docx document.");

        Screen screen = new Screen();
        screen.viewBROfficeDocument(doc1);
        screen.viewWordDocument(doc2);
    }
}