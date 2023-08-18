package Enums;

enum BookGenre {
    FICTION("Fictional Books"),
    NON_FICTION("Non-Fictional Books"),
    MYSTERY("Mystery Books"),
    ROMANCE("Romance Books"),
    FANTASY("Fantasy Books"),
    SCIENCE_FICTION("Science Fiction Books");

    private String genreDescription;

    BookGenre(String genreDescription) {
        this.genreDescription = genreDescription;
    }



    public String getGenreDescription() {
        return genreDescription;
    }
}