package ocp.original;

public class Logger {
	
	public final int TYPE_RAW_LOG = 1;
	public final int TYPE_RAW_LOG_WITH_DATE = 2;
	public final int METHOD_EMAIL_LOG = 1;
	public final int METHOD_SMS_LOG = 2;
	public final int METHOD_PRINT_LOG = 3;
	
	int type = 0;
	int method = 0;
			
	public Logger(int logType, int logMethod){
		this.type = logType;
		this.method = logMethod;		
	}
	public void log(String msg){
		
		String logMsg = msg;
		
		if(this.type == TYPE_RAW_LOG){
			logMsg = msg;
		} else if(this.type == TYPE_RAW_LOG_WITH_DATE){
			String txtDate = DateUtil.getCurrentDateAsString();
			logMsg = txtDate + ": " + msg;
		}
		
		if(this.method == METHOD_EMAIL_LOG){
			MailUtil.send(logMsg);
		} else if(this.method == METHOD_SMS_LOG){
			SMSUtil.send(logMsg);
		} else if(this.method == METHOD_PRINT_LOG){
			System.out.println(logMsg);
		}
	}
}

