class Main {
    public static void main(String[] args) {
        Author author = new Author("Виктор", "Пелевин");
        Author author1 = new Author("Братья", "Стругацкие");
        Book book = new Book("The Yellow Arrow", author, 1993);
        Book book2 = new Book("Snail on the slope", author1, 1966);
        book.setYearOfPublication(1997);
        System.out.println(book.getName()+" "+book.getYearOfPublication()+ " " +author.getName1() + " " + author.getsecondName());
        System.out.println(book2.getName()+" "+book2.getYearOfPublication()+ " " +author1.getName1() + " " + author1.getsecondName());

// Вроде всё так)





        }


}