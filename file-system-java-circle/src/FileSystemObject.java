

import java.time.LocalDateTime;

public abstract class FileSystemObject {
	protected String name;
	protected int sizeInBytes;
	private LocalDateTime creationDate;
	private LocalDateTime lastModified;

	public FileSystemObject(String name) {
		this.name = name;
		this.creationDate = LocalDateTime.now();
		this.lastModified = this.creationDate;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	
	public LocalDateTime getLastModified() {
		return lastModified;
	}
	
	public abstract int calcSizeIntBytes();
}
