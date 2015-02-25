package com.aspose.imaging.model;

public class GifProperties {
  private String BackgroundColor = null;
  private Boolean HasTrailer = null;
  private String PixelAspectRatio = null;
  /**
	 * getBackgroundColor
	 * Gets String
	 * @return BackgroundColor
	 */
  public String getBackgroundColor() {
    return BackgroundColor;
  }

	/**
	 * setBackgroundColor
	 * Sets String
	 * @param BackgroundColor String
	 */
  public void setBackgroundColor(String BackgroundColor) {
    this.BackgroundColor = BackgroundColor;
  }

  /**
	 * getHasTrailer
	 * Gets Boolean
	 * @return HasTrailer
	 */
  public Boolean getHasTrailer() {
    return HasTrailer;
  }

	/**
	 * setHasTrailer
	 * Sets Boolean
	 * @param HasTrailer Boolean
	 */
  public void setHasTrailer(Boolean HasTrailer) {
    this.HasTrailer = HasTrailer;
  }

  /**
	 * getPixelAspectRatio
	 * Gets String
	 * @return PixelAspectRatio
	 */
  public String getPixelAspectRatio() {
    return PixelAspectRatio;
  }

	/**
	 * setPixelAspectRatio
	 * Sets String
	 * @param PixelAspectRatio String
	 */
  public void setPixelAspectRatio(String PixelAspectRatio) {
    this.PixelAspectRatio = PixelAspectRatio;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GifProperties {\n");
    sb.append("  BackgroundColor: ").append(BackgroundColor).append("\n");
    sb.append("  HasTrailer: ").append(HasTrailer).append("\n");
    sb.append("  PixelAspectRatio: ").append(PixelAspectRatio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

