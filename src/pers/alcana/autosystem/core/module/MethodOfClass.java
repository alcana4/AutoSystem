package pers.alcana.autosystem.core.module;

import pers.alcana.autosystem.core.param.ParamBase;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by junsonglv on 2016/7/6.
 */
public class MethodOfClass implements MethodBase {
    protected MethodInfo methodInfo;
    protected Object objBelong;
    protected Method curMethod;
    protected Object lastReturn;
    protected ArrayList<ParamBase> paramList;

    public MethodOfClass(MethodInfo methodInfo) {
        this.methodInfo=(MethodInfo) methodInfo.clone();
        objBelong=null;
        curMethod=null;
        lastReturn=null;
        paramList=new ArrayList<>();
    }

    public boolean setParameters(ParamBase[] params){
        return true;
    }

    public void setMethod(Object objBelong,Method method){
        this.objBelong=objBelong;
        this.curMethod=method;
    }

    public boolean invokeMethod(){
        return true;
    }

    public Object getLastReturn(){
        return lastReturn;
    }

}
