package test.file.dto;

public class FileDto {
	private int num;
	private String writer;
	private String title;
	private String orgFileName;
	private String saveFileName;
	private long fileSize; //파일의 크기는 byte 단위로 큰 정수를 쓰기 때문에 long int 를 사용한다.
	private String regdate;
	
	//생성자 
	public FileDto() {}

	public FileDto(int num, String writer, String title, String orgFileName, String saveFileName, long fileSize,
			String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.orgFileName = orgFileName;
		this.saveFileName = saveFileName;
		this.fileSize = fileSize;
		this.regdate = regdate;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrgFileName() {
		return orgFileName;
	}

	public void setOrgFileName(String orgFileName) {
		this.orgFileName = orgFileName;
	}

	public String getSaveFileName() {
		return saveFileName;
	}

	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
