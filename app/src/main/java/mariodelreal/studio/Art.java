package mariodelreal.studio;

import java.util.Date;

public class Art
{
    private String title;
    private int width;
    private int height;
    private int price;
    private Date submissionDate;
    private String tags;
    private String userNotes;

    private long id;

    Art()
    {
        submissionDate = new Date(System.currentTimeMillis());
    }

}
