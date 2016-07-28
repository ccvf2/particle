package com.mynetgear.ccvf3.common;

import java.io.File;

/** Particle 프로젝트의 기본 DTO 다른 DTO들은 이 DTO를 상속함으로 사용이 가능 */
public class DefaultParticleDTO {
	/** 글 전체 개수 */
	private int totalCount = 0;
	/** 시작 글 번호 */
	private int startRow;
	/** 끝 글 번호 */
	private int endRow;
	/** 현재 선택된 페이지 */
	private int currentPage = 1;
	/** 화면에 뿌릴 페이지 개수 */
	private int pageBlock = 5;
	/** 총 페이지 개수 */
	private int pageCount;
	/** 화면에 뿌릴 시작 페이지 번호 */
	private int startPage;
	/** 화면에 뿌릴 끝 페이지 번호 */
	private int endPage;

	/** 파일 : 파일 고유번호 */
	private int file_no = 0;
	/** 파일 : 파일 사용처 코드 */
	private String type_code = "";
	/** 파일 : 파일 사용처 글코드 */
	private int write_no = 0;
	/** 파일 : 파일 확장자 */
	private String extension = "";
	/** 파일 : 사용자자 업로드한 파일명 */
	private String real_name = "";
	/** 파일 : 서버에 실제저장 파일명 */
	private String save_name = "";
	/** 파일 : 서버에 실제저장 파일위치 */
	private String save_path = "";
	/** 파일 : 파일크기 */
	private long file_size = 0;
	/** 파일 : 파일객체 */
	private File file = null;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageBlock() {
		return pageBlock;
	}

	public void setPageBlock(int pageBlock) {
		this.pageBlock = pageBlock;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getFile_no() {
		return file_no;
	}

	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
	}

	public int getWrite_no() {
		return write_no;
	}

	public void setWrite_no(int write_no) {
		this.write_no = write_no;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getSave_name() {
		return save_name;
	}

	public void setSave_name(String save_name) {
		this.save_name = save_name;
	}

	public String getSave_path() {
		return save_path;
	}

	public void setSave_path(String save_path) {
		this.save_path = save_path;
	}

	public long getFile_size() {
		return file_size;
	}

	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
