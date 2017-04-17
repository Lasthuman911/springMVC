package spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.Spittle;
import spittr.data.SpittleRepository;

/*@Controller
@RequestMapping("/spittles")*/
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(//注入spittleRepository
            SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(//将spittle添加到模型中
                spittleRepository.findSpittles(
                        Long.MAX_VALUE, 20));
        return "spittles";//返回视图名
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Spittle> spittles() {
        return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
    }
}