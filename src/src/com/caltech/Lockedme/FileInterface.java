package com.caltech.Lockedme;

import java.io.IOException;

public interface FileInterface {
	public void showAllFiles();
	public void addFile() throws IOException;
	public void deleteFile();
	abstract void searchFile();
}
