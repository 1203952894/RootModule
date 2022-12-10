package xyz.ccola.test;


import xyz.ccola.bo.CurInfoBO;
import xyz.ccola.bo.NoteBO;
import xyz.ccola.play.AnimationFx;
import xyz.ccola.play.AudioPlay;
import xyz.ccola.util.ReadXmlAsNoteUtil;
import xyz.ccola.util.SortNoteUtil;

import java.util.ArrayList;
import java.util.List;


/**
 * @author gulihua
 * @Description
 * @date 2022-12-08 00:47
 */
public class Test2 {
    public static void main(String[] args) {
        CurInfoBO curInfo = new CurInfoBO();
        List<NoteBO> noteList_n = ReadXmlAsNoteUtil.getInstance()
                .readAsNote("E:\\2022_snowHosbility\\study\\heima\\2022_SSM\\RootModule\\commonDays\\day_01_playPiano\\src\\main\\resources\\notes\\大鱼_主奏.xml", NoteBO.Mode.MAIN);

        List<NoteBO> noteList_n1 = ReadXmlAsNoteUtil.getInstance()
                .readAsNote("E:\\2022_snowHosbility\\study\\heima\\2022_SSM\\RootModule\\commonDays\\day_01_playPiano\\src\\main\\resources\\notes\\大鱼_伴奏.xml", NoteBO.Mode.ACCOMPANIMENTS);

        List<NoteBO> list = new ArrayList<>();
        list.addAll(noteList_n);
        list.addAll(noteList_n1);
        list = SortNoteUtil.processMergeNoteBo(list);

        new AudioPlay(noteList_n, NoteBO.Mode.MAIN,curInfo).start();
        new AudioPlay(noteList_n1, NoteBO.Mode.MAIN,curInfo).start();
        Runnable runnable = AnimationFx.build(list, "大鱼",curInfo).setMinAndMaxVal(65, 87);
        new Thread(runnable).start();
    }
}
