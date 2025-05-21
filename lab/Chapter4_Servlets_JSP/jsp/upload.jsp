<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%
    String contentType = request.getContentType();
    if (contentType != null && contentType.indexOf("multipart/form-data") >= 0) {

        DataInputStream in = new DataInputStream(request.getInputStream());
        int formDataLength = request.getContentLength();

        byte dataBytes[] = new byte[formDataLength];
        int byteRead = 0;
        int totalBytesRead = 0;

        while (totalBytesRead < formDataLength) {
            byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
            totalBytesRead += byteRead;
        }

        String file = new String(dataBytes);
        String saveFile = file.substring(file.indexOf("filename=\"") + 10);
        saveFile = saveFile.substring(0, saveFile.indexOf("\""));

        // Set the path where file will be saved
        String filePath = application.getRealPath("/") + "uploads\\" + saveFile;

        int lastIndex = file.indexOf("filename=\"");
        lastIndex = file.indexOf("\n", lastIndex) + 1;
        lastIndex = file.indexOf("\n", lastIndex) + 1;
        lastIndex = file.indexOf("\n", lastIndex) + 1;

        int boundaryLocation = file.indexOf("------", lastIndex) - 4;
        String fileContent = file.substring(lastIndex, boundaryLocation);

        FileOutputStream fileOut = new FileOutputStream(filePath);
        fileOut.write(fileContent.getBytes());
        fileOut.flush();
        fileOut.close();

        out.println("<br>File " + saveFile + " uploaded successfully!");
    }
%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Upload File Using JSP</title>
</head>
<body>
   
    <h2>Upload File</h2>

    <form  method="post" enctype="multipart/form-data">
        Select File: <input type="file" name="file"><br><br>
        <input type="submit" value="Upload">
    </form>
    
</body>
</html>
