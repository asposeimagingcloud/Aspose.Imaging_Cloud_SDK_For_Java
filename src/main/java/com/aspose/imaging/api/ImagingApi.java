package com.aspose.imaging.api;

import com.aspose.client.ApiException;
import com.aspose.client.ApiInvoker;
import com.aspose.client.ApiInvokerResponse;

import com.aspose.imaging.model.ResponseMessage;
import com.aspose.imaging.model.ImagingResponse;
import com.aspose.imaging.model.SaaSposeResponse;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class ImagingApi {
  String basePath = "http://api.aspose.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();
  ApiInvokerResponse response = null;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageBmp
	* Update parameters of bmp image.
	* @param name	String	Filename of image.
	* @param bitsPerPixel	Integer	Color depth.
	* @param horizontalResolution	Integer	New horizontal resolution.
	* @param verticalResolution	Integer	New vertical resolution.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageBmp (String name, Integer bitsPerPixel, Integer horizontalResolution, Integer verticalResolution, Boolean fromScratch, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || bitsPerPixel == null || horizontalResolution == null || verticalResolution == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/bmp/?appSid={appSid}&amp;bitsPerPixel={bitsPerPixel}&amp;horizontalResolution={horizontalResolution}&amp;verticalResolution={verticalResolution}&amp;fromScratch={fromScratch}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(bitsPerPixel!=null)
      queryParams.put("bitsPerPixel", String.valueOf(bitsPerPixel));
    if(horizontalResolution!=null)
      queryParams.put("horizontalResolution", String.valueOf(horizontalResolution));
    if(verticalResolution!=null)
      queryParams.put("verticalResolution", String.valueOf(verticalResolution));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImageBmp
	* Update parameters of bmp image.
	* @param bitsPerPixel	Integer	Color depth.
	* @param horizontalResolution	Integer	New horizontal resolution.
	* @param verticalResolution	Integer	New vertical resolution.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImageBmp (Integer bitsPerPixel, Integer horizontalResolution, Integer verticalResolution, Boolean fromScratch, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(bitsPerPixel == null || horizontalResolution == null || verticalResolution == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/bmp/?appSid={appSid}&amp;bitsPerPixel={bitsPerPixel}&amp;horizontalResolution={horizontalResolution}&amp;verticalResolution={verticalResolution}&amp;fromScratch={fromScratch}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(bitsPerPixel!=null)
      queryParams.put("bitsPerPixel", String.valueOf(bitsPerPixel));
    if(horizontalResolution!=null)
      queryParams.put("horizontalResolution", String.valueOf(horizontalResolution));
    if(verticalResolution!=null)
      queryParams.put("verticalResolution", String.valueOf(verticalResolution));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetCropImage
	* Crop existing image
	* @param name	String	The image name.
	* @param format	String	Output file format. Valid Formats: Bmp, png, jpg, tiff, psd, gif.
	* @param x	Integer	X position of start point for cropping rectangle
	* @param y	Integer	Y position of start point for cropping rectangle
	* @param width	Integer	Width of cropping rectangle
	* @param height	Integer	Height of cropping rectangle
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetCropImage (String name, String format, Integer x, Integer y, Integer width, Integer height, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null || x == null || y == null || width == null || height == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/crop/?appSid={appSid}&amp;toFormat={toFormat}&amp;x={x}&amp;y={y}&amp;width={width}&amp;height={height}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(x!=null)
      queryParams.put("x", String.valueOf(x));
    if(y!=null)
      queryParams.put("y", String.valueOf(y));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostCropImage
	* Crop image from body
	* @param format	String	Output file format. Valid Formats: Bmp, png, jpg, tiff, psd, gif.
	* @param x	Integer	X position of start point for cropping rectangle
	* @param y	Integer	Y position of start point for cropping rectangle
	* @param width	Integer	Width of cropping rectangle
	* @param height	Integer	Height of cropping rectangle
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostCropImage (String format, Integer x, Integer y, Integer width, Integer height, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(format == null || x == null || y == null || width == null || height == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/crop/?appSid={appSid}&amp;toFormat={toFormat}&amp;x={x}&amp;y={y}&amp;width={width}&amp;height={height}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(x!=null)
      queryParams.put("x", String.valueOf(x));
    if(y!=null)
      queryParams.put("y", String.valueOf(y));
    if(width!=null)
      queryParams.put("width", String.valueOf(width));
    if(height!=null)
      queryParams.put("height", String.valueOf(height));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageFrame
	* Get separate frame of tiff image
	* @param name	String	Filename of image.
	* @param frameId	Integer	Number of frame.
	* @param newWidth	Integer	New width of the scaled image.
	* @param newHeight	Integer	New height of the scaled image.
	* @param x	Integer	X position of start point for cropping rectangle
	* @param y	Integer	Y position of start point for cropping rectangle
	* @param rectWidth	Integer	Width of cropping rectangle
	* @param rectHeight	Integer	Height of cropping rectangle
	* @param rotateFlipMethod	String	RotateFlip method.(Rotate180FlipNone, Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY,             Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY,             Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY.             Default is RotateNoneFlipNone.)
	* @param saveOtherFrames	Boolean	Include all other frames or just specified frame in response.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageFrame (String name, Integer frameId, Integer newWidth, Integer newHeight, Integer x, Integer y, Integer rectWidth, Integer rectHeight, String rotateFlipMethod, Boolean saveOtherFrames, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || frameId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/frames/{frameId}/?appSid={appSid}&amp;newWidth={newWidth}&amp;newHeight={newHeight}&amp;x={x}&amp;y={y}&amp;rectWidth={rectWidth}&amp;rectHeight={rectHeight}&amp;rotateFlipMethod={rotateFlipMethod}&amp;saveOtherFrames={saveOtherFrames}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(frameId!=null)
      queryParams.put("frameId", String.valueOf(frameId));
    if(newWidth!=null)
      queryParams.put("newWidth", String.valueOf(newWidth));
    if(newHeight!=null)
      queryParams.put("newHeight", String.valueOf(newHeight));
    if(x!=null)
      queryParams.put("x", String.valueOf(x));
    if(y!=null)
      queryParams.put("y", String.valueOf(y));
    if(rectWidth!=null)
      queryParams.put("rectWidth", String.valueOf(rectWidth));
    if(rectHeight!=null)
      queryParams.put("rectHeight", String.valueOf(rectHeight));
    if(rotateFlipMethod!=null)
      queryParams.put("rotateFlipMethod", String.valueOf(rotateFlipMethod));
    if(saveOtherFrames!=null)
      queryParams.put("saveOtherFrames", String.valueOf(saveOtherFrames));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageFrameProperties
	* Get properties of a tiff frame.
	* @param name	String	Filename with image.
	* @param frameId	Integer	Number of frame.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ImagingResponse
	*/

  public ImagingResponse GetImageFrameProperties (String name, Integer frameId, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || frameId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/frames/{frameId}/properties/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(frameId!=null)
      queryParams.put("frameId", String.valueOf(frameId));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ImagingResponse) ApiInvoker.deserialize(response, "", ImagingResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageGif
	* Update parameters of bmp image.
	* @param name	String	Filename of image.
	* @param backgroundColorIndex	String	Index of the background color.
	* @param colorResolution	String	Color resolution.
	* @param hasTrailer	Boolean	Specifies if image has trailer.
	* @param interlaced	Boolean	Specifies if image is interlaced.
	* @param isPaletteSorted	Boolean	Specifies if palette is sorted.
	* @param pixelAspectRatio	String	Pixel aspect ratio.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageGif (String name, String backgroundColorIndex, String colorResolution, Boolean hasTrailer, Boolean interlaced, Boolean isPaletteSorted, String pixelAspectRatio, Boolean fromScratch, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/gif/?appSid={appSid}&amp;backgroundColorIndex={backgroundColorIndex}&amp;colorResolution={colorResolution}&amp;hasTrailer={hasTrailer}&amp;interlaced={interlaced}&amp;isPaletteSorted={isPaletteSorted}&amp;pixelAspectRatio={pixelAspectRatio}&amp;fromScratch={fromScratch}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(backgroundColorIndex!=null)
      queryParams.put("backgroundColorIndex", String.valueOf(backgroundColorIndex));
    if(colorResolution!=null)
      queryParams.put("colorResolution", String.valueOf(colorResolution));
    if(hasTrailer!=null)
      queryParams.put("hasTrailer", String.valueOf(hasTrailer));
    if(interlaced!=null)
      queryParams.put("interlaced", String.valueOf(interlaced));
    if(isPaletteSorted!=null)
      queryParams.put("isPaletteSorted", String.valueOf(isPaletteSorted));
    if(pixelAspectRatio!=null)
      queryParams.put("pixelAspectRatio", String.valueOf(pixelAspectRatio));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImageBmp_ImagingApi_0
	* Update parameters of gif image.
	* @param backgroundColorIndex	String	Index of the background color.
	* @param colorResolution	String	Color resolution.
	* @param hasTrailer	Boolean	Specifies if image has trailer.
	* @param interlaced	Boolean	Specifies if image is interlaced.
	* @param isPaletteSorted	Boolean	Specifies if palette is sorted.
	* @param pixelAspectRatio	String	Pixel aspect ratio.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImageBmp_ImagingApi_0 (String backgroundColorIndex, String colorResolution, Boolean hasTrailer, Boolean interlaced, Boolean isPaletteSorted, String pixelAspectRatio, Boolean fromScratch, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/gif/?appSid={appSid}&amp;backgroundColorIndex={backgroundColorIndex}&amp;colorResolution={colorResolution}&amp;hasTrailer={hasTrailer}&amp;interlaced={interlaced}&amp;isPaletteSorted={isPaletteSorted}&amp;pixelAspectRatio={pixelAspectRatio}&amp;fromScratch={fromScratch}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(backgroundColorIndex!=null)
      queryParams.put("backgroundColorIndex", String.valueOf(backgroundColorIndex));
    if(colorResolution!=null)
      queryParams.put("colorResolution", String.valueOf(colorResolution));
    if(hasTrailer!=null)
      queryParams.put("hasTrailer", String.valueOf(hasTrailer));
    if(interlaced!=null)
      queryParams.put("interlaced", String.valueOf(interlaced));
    if(isPaletteSorted!=null)
      queryParams.put("isPaletteSorted", String.valueOf(isPaletteSorted));
    if(pixelAspectRatio!=null)
      queryParams.put("pixelAspectRatio", String.valueOf(pixelAspectRatio));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageJpg
	* Update parameters of jpg image.
	* @param name	String	Filename of image.
	* @param quality	Integer	Quality of image. From 0 to 100. Default is 75
	* @param compressionType	String	Compression type.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageJpg (String name, Integer quality, String compressionType, Boolean fromScratch, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/jpg/?appSid={appSid}&amp;quality={quality}&amp;compressionType={compressionType}&amp;fromScratch={fromScratch}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(quality!=null)
      queryParams.put("quality", String.valueOf(quality));
    if(compressionType!=null)
      queryParams.put("compressionType", String.valueOf(compressionType));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImageJpg
	* Update parameters of jpg image.
	* @param quality	Integer	Quality of image. From 0 to 100. Default is 75
	* @param compressionType	String	Compression type.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImageJpg (Integer quality, String compressionType, Boolean fromScratch, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/jpg/?appSid={appSid}&amp;quality={quality}&amp;compressionType={compressionType}&amp;fromScratch={fromScratch}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(quality!=null)
      queryParams.put("quality", String.valueOf(quality));
    if(compressionType!=null)
      queryParams.put("compressionType", String.valueOf(compressionType));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImagePng
	* Update parameters of png image.
	* @param name	String	Filename of image.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImagePng (String name, Boolean fromScratch, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/png/?appSid={appSid}&amp;fromScratch={fromScratch}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImagePng
	* Update parameters of png image.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImagePng (Boolean fromScratch, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/png/?appSid={appSid}&amp;fromScratch={fromScratch}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageProperties
	* Get properties of an image.
	* @param name	String	The image name.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ImagingResponse
	*/

  public ImagingResponse GetImageProperties (String name, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/properties/?appSid={appSid}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ImagingResponse) ApiInvoker.deserialize(response, "", ImagingResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImagePsd
	* Update parameters of psd image.
	* @param name	String	Filename of image.
	* @param channelsCount	Integer	Count of channels.
	* @param compressionMethod	String	Compression method.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImagePsd (String name, Integer channelsCount, String compressionMethod, Boolean fromScratch, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/psd/?appSid={appSid}&amp;channelsCount={channelsCount}&amp;compressionMethod={compressionMethod}&amp;fromScratch={fromScratch}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(channelsCount!=null)
      queryParams.put("channelsCount", String.valueOf(channelsCount));
    if(compressionMethod!=null)
      queryParams.put("compressionMethod", String.valueOf(compressionMethod));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImagePsd
	* Update parameters of psd image.
	* @param channelsCount	Integer	Count of channels.
	* @param compressionMethod	String	Compression method.
	* @param fromScratch	Boolean	Specifies where additional parameters we do not support should be taken from. If this is true – they will be taken from default values for standard image, if it is false – they will be saved from current image. Default is false.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImagePsd (Integer channelsCount, String compressionMethod, Boolean fromScratch, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/psd/?appSid={appSid}&amp;channelsCount={channelsCount}&amp;compressionMethod={compressionMethod}&amp;fromScratch={fromScratch}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(channelsCount!=null)
      queryParams.put("channelsCount", String.valueOf(channelsCount));
    if(compressionMethod!=null)
      queryParams.put("compressionMethod", String.valueOf(compressionMethod));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetChangeImageScale
	* Change scale of an existing image
	* @param name	String	The image name.
	* @param format	String	Output file format. Valid Formats: Bmp, png, jpg, tiff, psd, gif.
	* @param newWidth	Integer	New width of the scaled image.
	* @param newHeight	Integer	New height of the scaled image.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetChangeImageScale (String name, String format, Integer newWidth, Integer newHeight, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null || newWidth == null || newHeight == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/resize/?appSid={appSid}&amp;toFormat={toFormat}&amp;newWidth={newWidth}&amp;newHeight={newHeight}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(newWidth!=null)
      queryParams.put("newWidth", String.valueOf(newWidth));
    if(newHeight!=null)
      queryParams.put("newHeight", String.valueOf(newHeight));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostChangeImageScale
	* Change scale of an image from body
	* @param format	String	Output file format. Valid Formats: Bmp, png, jpg, tiff, psd, gif.
	* @param newWidth	Integer	New width of the scaled image.
	* @param newHeight	Integer	New height of the scaled image.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostChangeImageScale (String format, Integer newWidth, Integer newHeight, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(format == null || newWidth == null || newHeight == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/resize/?appSid={appSid}&amp;toFormat={toFormat}&amp;newWidth={newWidth}&amp;newHeight={newHeight}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(newWidth!=null)
      queryParams.put("newWidth", String.valueOf(newWidth));
    if(newHeight!=null)
      queryParams.put("newHeight", String.valueOf(newHeight));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageRotateFlip
	* Rotate and flip existing image
	* @param name	String	Filename of image.
	* @param format	String	Number of frame. (Bmp, png, jpg, tiff, psd, gif.)
	* @param method	String	New width of the scaled image. (Rotate180FlipNone,  Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY)
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageRotateFlip (String name, String format, String method, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null || method == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/rotateflip/?toFormat={toFormat}&amp;appSid={appSid}&amp;method={method}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(method!=null)
      queryParams.put("method", String.valueOf(method));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImageRotateFlip
	* Rotate and flip existing image and get it from response.
	* @param format	String	Number of frame. (Bmp, png, jpg, tiff, psd, gif.)
	* @param method	String	New width of the scaled image. (Rotate180FlipNone,  Rotate180FlipX, Rotate180FlipXY, Rotate180FlipY, Rotate270FlipNone, Rotate270FlipX, Rotate270FlipXY, Rotate270FlipY, Rotate90FlipNone, Rotate90FlipX, Rotate90FlipXY, Rotate90FlipY, RotateNoneFlipNone, RotateNoneFlipX, RotateNoneFlipXY, RotateNoneFlipY)
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImageRotateFlip (String format, String method, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(format == null || method == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/rotateflip/?toFormat={toFormat}&amp;appSid={appSid}&amp;method={method}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(method!=null)
      queryParams.put("method", String.valueOf(method));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetImageSaveAs
	* Export existing image to another format
	* @param name	String	Filename of image.
	* @param format	String	Output file format. (Bmp, png, jpg, tiff, psd, gif.)
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetImageSaveAs (String name, String format, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/saveAs/?appSid={appSid}&amp;toFormat={toFormat}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImageSaveAs
	* Export existing image to another format. Image is passed as request body.
	* @param format	String	Output file format. (Bmp, png, jpg, tiff, psd, gif.)
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImageSaveAs (String format, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(format == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/saveAs/?appSid={appSid}&amp;toFormat={toFormat}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetTiffToFax
	* Get tiff image for fax.
	* @param name	String	The image file name.
	* @param storage	String	The image file storage.
	* @param folder	String	The image file folder.
	* @param outPath	String	Path to save result
	* @return ResponseMessage
	*/

  public ResponseMessage GetTiffToFax (String name, String storage, String folder, String outPath) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/tiff/{name}/toFax/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostProcessTiff
	* Update tiff image.
	* @param compression	String	New compression.
	* @param resolutionUnit	String	New resolution unit.
	* @param bitDepth	Integer	New bit depth.
	* @param fromScratch	Boolean	
	* @param horizontalResolution	Float	New horizontal resolution.
	* @param verticalResolution	Float	New verstical resolution.
	* @param outPath	String	Path to save result
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostProcessTiff (String compression, String resolutionUnit, Integer bitDepth, Boolean fromScratch, Float horizontalResolution, Float verticalResolution, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/tiff/?appSid={appSid}&amp;compression={compression}&amp;resolutionUnit={resolutionUnit}&amp;bitDepth={bitDepth}&amp;fromScratch={fromScratch}&amp;horizontalResolution={horizontalResolution}&amp;verticalResolution={verticalResolution}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(compression!=null)
      queryParams.put("compression", String.valueOf(compression));
    if(resolutionUnit!=null)
      queryParams.put("resolutionUnit", String.valueOf(resolutionUnit));
    if(bitDepth!=null)
      queryParams.put("bitDepth", String.valueOf(bitDepth));
    if(fromScratch!=null)
      queryParams.put("fromScratch", String.valueOf(fromScratch));
    if(horizontalResolution!=null)
      queryParams.put("horizontalResolution", String.valueOf(horizontalResolution));
    if(verticalResolution!=null)
      queryParams.put("verticalResolution", String.valueOf(verticalResolution));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostTiffAppend
	* Append tiff image.
	* @param name	String	Original image name.
	* @param appendFile	String	Second image file name.
	* @param storage	String	The images storage.
	* @param folder	String	The images folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostTiffAppend (String name, String appendFile, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/tiff/{name}/appendTiff/?appSid={appSid}&amp;appendFile={appendFile}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(appendFile!=null)
      queryParams.put("appendFile", String.valueOf(appendFile));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetUpdatedImage
	* Perform scaling, cropping and flipping of an image in single request.
	* @param name	String	Filename of image.
	* @param format	String	Save image in another format. By default format remains the same
	* @param newWidth	Integer	New Width of the scaled image.
	* @param newHeight	Integer	New height of the scaled image.
	* @param x	Integer	X position of start point for cropping rectangle
	* @param y	Integer	Y position of start point for cropping rectangle
	* @param rectWidth	Integer	Width of cropping rectangle
	* @param rectHeight	Integer	Height of cropping rectangle
	* @param rotateFlipMethod	String	RotateFlip method. Default is RotateNoneFlipNone.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param folder	String	Folder with image to process.
	* @param storage	String	
	* @return ResponseMessage
	*/

  public ResponseMessage GetUpdatedImage (String name, String format, Integer newWidth, Integer newHeight, Integer x, Integer y, Integer rectWidth, Integer rectHeight, String rotateFlipMethod, String outPath, String folder, String storage) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null || newWidth == null || newHeight == null || x == null || y == null || rectWidth == null || rectHeight == null || rotateFlipMethod == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/{name}/updateImage/?appSid={appSid}&amp;toFormat={toFormat}&amp;newWidth={newWidth}&amp;newHeight={newHeight}&amp;x={x}&amp;y={y}&amp;rectWidth={rectWidth}&amp;rectHeight={rectHeight}&amp;rotateFlipMethod={rotateFlipMethod}&amp;outPath={outPath}&amp;folder={folder}&amp;storage={storage}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(newWidth!=null)
      queryParams.put("newWidth", String.valueOf(newWidth));
    if(newHeight!=null)
      queryParams.put("newHeight", String.valueOf(newHeight));
    if(x!=null)
      queryParams.put("x", String.valueOf(x));
    if(y!=null)
      queryParams.put("y", String.valueOf(y));
    if(rectWidth!=null)
      queryParams.put("rectWidth", String.valueOf(rectWidth));
    if(rectHeight!=null)
      queryParams.put("rectHeight", String.valueOf(rectHeight));
    if(rotateFlipMethod!=null)
      queryParams.put("rotateFlipMethod", String.valueOf(rotateFlipMethod));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostImageSaveAs_ImagingApi_0
	* Perform scaling, cropping and flipping of an image in single request. Image is passed as request body.
	* @param format	String	Save image in another format. By default format remains the same
	* @param newWidth	Integer	New Width of the scaled image.
	* @param newHeight	Integer	New height of the scaled image.
	* @param x	Integer	X position of start point for cropping rectangle
	* @param y	Integer	Y position of start point for cropping rectangle
	* @param rectWidth	Integer	Width of cropping rectangle
	* @param rectHeight	Integer	Height of cropping rectangle
	* @param rotateFlipMethod	String	RotateFlip method. Default is RotateNoneFlipNone.
	* @param outPath	String	Path to updated file, if this is empty, response contains streamed image.
	* @param file	File	
	* @return ResponseMessage
	*/

  public ResponseMessage PostImageSaveAs_ImagingApi_0 (String format, Integer newWidth, Integer newHeight, Integer x, Integer y, Integer rectWidth, Integer rectHeight, String rotateFlipMethod, String outPath, File file) {
    Object postBody = null;
    // verify required params are set
    if(format == null || newWidth == null || newHeight == null || x == null || y == null || rectWidth == null || rectHeight == null || rotateFlipMethod == null || file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/imaging/updateImage/?appSid={appSid}&amp;toFormat={toFormat}&amp;newWidth={newWidth}&amp;newHeight={newHeight}&amp;x={x}&amp;y={y}&amp;rectWidth={rectWidth}&amp;rectHeight={rectHeight}&amp;rotateFlipMethod={rotateFlipMethod}&amp;outPath={outPath}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(newWidth!=null)
      queryParams.put("newWidth", String.valueOf(newWidth));
    if(newHeight!=null)
      queryParams.put("newHeight", String.valueOf(newHeight));
    if(x!=null)
      queryParams.put("x", String.valueOf(x));
    if(y!=null)
      queryParams.put("y", String.valueOf(y));
    if(rectWidth!=null)
      queryParams.put("rectWidth", String.valueOf(rectWidth));
    if(rectHeight!=null)
      queryParams.put("rectHeight", String.valueOf(rectHeight));
    if(rotateFlipMethod!=null)
      queryParams.put("rotateFlipMethod", String.valueOf(rotateFlipMethod));
    if(outPath!=null)
      queryParams.put("outPath", String.valueOf(outPath));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  }

