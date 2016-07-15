package pers.alcana.autosystem.core.module;

import pers.alcana.autosystem.core.param.ParamBase;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by junsonglv on 2016/7/5.
 */
public interface MethodBase {
    boolean setParameters(ParamBase[] params);
    boolean invokeMethod();
    Object getLastReturn();
}
