package csejeonju2019.go.kr.insta;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pm10.library.CircleIndicator;


public class Frag1 extends Fragment
{


    int i=0;
    ViewPager viewPager1;
    ViewPager viewPager2;
    ViewPager viewPager3;
    private FirstFragment fragment1;
    private SecondFragment fragment2;
    private ThirdFragment fragment3;
    private SecondOneFragment fragment2_1;
    private SecondTwoFragment fragment2_2;
    private SecondThreeFragment fragment2_3;
    private  ThirdOneFragment fragment3_1;
    private ThirdTwoFragment fragment3_2;
    private ThirdThreeFragment fragment3_3;
    public Frag1(){

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1, container, false);

        fragment1=new FirstFragment();
        fragment2=new SecondFragment();
        fragment3=new ThirdFragment();
        fragment2_1=new SecondOneFragment();
        fragment2_2=new SecondTwoFragment();
        fragment2_3=new SecondThreeFragment();
        fragment3_1=new ThirdOneFragment();
        fragment3_2=new ThirdTwoFragment();
        fragment3_3=new ThirdThreeFragment();
        viewPager1=(ViewPager)view.findViewById(R.id.viewPager);
       /*
        viewPager2=(ViewPager)view.findViewById(R.id.viewPager2);
        viewPager3=(ViewPager)view.findViewById(R.id.viewPager3);
        viewPager2.setAdapter(new PagerAdapter2(getChildFragmentManager()));
        viewPager2.setCurrentItem(0);
        viewPager3.setAdapter(new PagerAdapter3(getChildFragmentManager()));
        viewPager3.setCurrentItem(0);


        */
        viewPager1.setAdapter(new PagerAdapter(getChildFragmentManager()));

        viewPager1.setCurrentItem(0);



        CircleIndicator circleIndicator1=(CircleIndicator)view.findViewById(R.id.circle_indicator);

        circleIndicator1.setupWithViewPager(viewPager1);
        /*
        CircleIndicator circleIndicator2=(CircleIndicator)view.findViewById(R.id.circle_indicator2);
        circleIndicator2.setupWithViewPager(viewPager2);
        CircleIndicator circleIndicator3=(CircleIndicator)view.findViewById(R.id.circle_indicator3);
        circleIndicator3.setupWithViewPager(viewPager3);


         */
        return view;

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
    private class PagerAdapter extends FragmentPagerAdapter{
        public PagerAdapter(FragmentManager fm){
            super(fm);
            getItem(0);
        }
        public Fragment getItem(int position){
            if(position==0)
            {
                return fragment1;
            }else if(position==1){
                return fragment2;
            }else {
                return fragment3;
            }
        }
        public int getCount(){
            return 3; 
        }

    }
    /*
    private class PagerAdapter2 extends FragmentPagerAdapter{
        public PagerAdapter2(FragmentManager fm){
            super(fm);
            getItem(0);
        }
        public Fragment getItem(int position){
            if(position==0)
            {
                return fragment2_1;
            }else if(position==1){
                return fragment2_2;
            }else {
                return fragment2_3;
            }
        }
        public int getCount(){
            return 3;
        }

    }
    private class PagerAdapter3 extends FragmentPagerAdapter{
        public PagerAdapter3(FragmentManager fm){
            super(fm);
            getItem(0);
        }
        public Fragment getItem(int position){
            if(position==0)
            {
                return fragment3_1;
            }else if(position==1){
                return fragment3_2;
            }else {
                return fragment3_3;
            }
        }
        public int getCount(){
            return 3;
        }

    }


     */



}



