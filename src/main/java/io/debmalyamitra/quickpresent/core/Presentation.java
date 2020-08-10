package io.debmalyamitra.quickpresent.core;

import org.apache.poi.xslf.usermodel.*;
import java.io.*;
import io.debmalyamitra.quickpresent.util.*;

public class Presentation
{
  private XMLSlideShow ppt;
  public Presentation()
  {
    ppt = new XMLSlideShow();
    ppt.createSlide();
  }
  public void SaveToFile()
  {
    try {
      FileOutputStream out = new FileOutputStream("output/save.pptx");
      ppt.write(out);
      out.close();
    } catch(Exception e) {
      Debug.console(e.getMessage());
    }

  }
}
